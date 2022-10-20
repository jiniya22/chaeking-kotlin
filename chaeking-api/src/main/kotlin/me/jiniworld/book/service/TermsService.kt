package me.jiniworld.book.service

import kotlinx.coroutines.flow.toList
import me.jiniworld.book.domain.repository.TermsRepository
import me.jiniworld.book.model.DataResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class TermsService(
    private val termsRepository: TermsRepository,
) {

    suspend fun terms() =
        termsRepository.findAllBy()
            .toList()
            .let { DataResponse(data = it) }

}

