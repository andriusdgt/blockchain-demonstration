package lt.anddeg.blockchain

fun main(args: Array<String>) {
    val blockChain = BlockChain().apply {
        addBlock("block1")
        addBlock("block2")
        addBlock("block3")
    }
    tamperBlock(blockChain)
    blockChain.printAllBlocks()
    blockChain.validateBlocks()
}

private fun tamperBlock(blockChain: BlockChain) {
    blockChain.blocks[2].hash = "0000fa6a6e708270099d6dea167af1ec64310ba7aa2bd351b2090c91e5fdce58"
}
