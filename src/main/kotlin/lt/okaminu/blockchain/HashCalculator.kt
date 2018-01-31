package lt.okaminu.blockchain

import java.security.MessageDigest

fun calculateHash(block: Block): Pair<String, Int> {
    var digestInString = ""

    while (!isHashValid(digestInString)){
        block.nounce++
        digestInString = getStringDigest(block)
    }

    return Pair(digestInString, block.nounce)
}

fun getStringDigest(block: Block): String {
    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"
    val digest = MessageDigest.getInstance("SHA-256").digest(blockAsString.toByteArray())
    return digest.fold("", { str, byte -> str + "%02x".format(byte) })
}

val difficulty = 4

fun isHashValid(hash: String) = hash.startsWith("0".repeat(difficulty))