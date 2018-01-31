package lt.okaminu.blockchain

fun calculateHash(block: Block): Pair<String, Int> {
    block.nounce++
    val str = "${block.data}${block.previousHash}${block.timestamp}${block.nounce}"

    return Pair(str, block.nounce)
}
