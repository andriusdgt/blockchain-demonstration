package lt.okaminu.blockchain

class BlockChain (private val blocks: ArrayList<String> = arrayListOf()){
    fun addBlock(block: String) = blocks.add(block)
}