package lt.anddeg.blockchain

import java.security.MessageDigest

const val difficulty = 3

fun calculateHash(block: Block): Pair<String, Int> {
    var digestInString = ""

    while (!isHashValid(digestInString)){
        block.nonce++
        digestInString = getStringDigest(block)
    }

    return Pair(digestInString, block.nonce)
}

fun getStringDigest(block: Block): String {
    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nonce}"
    val digest = MessageDigest.getInstance("SHA-256").digest(blockAsString.toByteArray())
    return digest.fold("") { str, byte -> str + "%02x".format(byte) }
}

fun isHashValid(hash: String) = hash.startsWith("0".repeat(difficulty))