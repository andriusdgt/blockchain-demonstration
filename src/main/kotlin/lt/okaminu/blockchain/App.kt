package lt.okaminu.blockchain

fun main(args: Array<String>) {
    val blockChain = BlockChain().apply {
        addBlock("block1")
        addBlock("block2")
        addBlock("block3")
    }
    blockChain.printAllBlocks()
}