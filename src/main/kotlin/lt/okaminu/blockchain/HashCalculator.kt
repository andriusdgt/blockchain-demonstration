package lt.okaminu.blockchain

fun calculateHash(block: Block) = Pair(block.hash, block.nounce)