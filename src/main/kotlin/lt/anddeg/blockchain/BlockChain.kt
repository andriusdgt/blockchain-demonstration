package lt.anddeg.blockchain

class BlockChain {

    val blocks: ArrayList<Block> = arrayListOf(createBlock("genesis block", "123"))

    fun addBlock(data: String) {
        blocks.add(createBlock(data, blocks.last().hash))
    }

    fun printAllBlocks() =
            blocks.forEach {
                println("time=${it.timestamp} data=${it.data} nonce=${it.nonce} hash=${it.hash} " +
                        "previousHash=${it.previousHash}")
            }

    fun validateBlocks() {
        for (block in blocks) {
            if (!isHashValid(block.hash))
                println("block ${block.hash} is invalid")
            if (block.hash != getStringDigest(block))
                println("block ${block.hash} is corrupted")
        }
    }

    private fun createBlock(data: String, previousHash: String): Block {
        val block = Block(data, previousHash)
        val (hash, nonce) = calculateHash(block)
        block.hash = hash
        block.previousHash = previousHash
        block.nonce = nonce
        return block
    }

}