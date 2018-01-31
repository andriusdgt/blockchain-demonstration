package lt.okaminu.blockchain

import java.security.MessageDigest

fun calculateHash(block: Block): Pair<String, Int> {
    val hasher = MessageDigest.getInstance("SHA-256")
    block.nounce++
    val blockAsString = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"
    val digest = hasher.digest(blockAsString.toByteArray())

    return Pair(digest.fold("", {str, byte -> str + "%02x".format(byte)}), block.nounce)
}
