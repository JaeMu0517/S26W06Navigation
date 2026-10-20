
package kr.ac.kumoh.s20211107.s26w06navigation.repository

import kr.ac.kumoh.s20211107.s26w06navigation.model.Pokemon

interface PokemonRepository {
    suspend fun getAllPokemon(): List<Pokemon>
    suspend fun getPokemonById(id: Int): Pokemon?
}
