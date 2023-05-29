package devgraft.dgpay.domain.point.port.inbound

import devgraft.dgpay.domain.point.model.Amount
import devgraft.dgpay.domain.point.model.ServiceDescription
import devgraft.dgpay.domain.point.model.ServiceTransactionKey

/**
 * 포인트 송금
 */
interface PointRemitUseCase {
    fun remit(senderId: String, receiverId: String, amount: Amount, description: ServiceDescription): ServiceTransactionKey
}