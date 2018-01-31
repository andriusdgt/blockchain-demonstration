package lt.okaminu.blockchain

fun main(args: Array<String>) {
    val blockChain = BlockChain()
    blockChain.addBlock("block1")
    blockChain.addBlock("block2")
    blockChain.addBlock("block3")
}