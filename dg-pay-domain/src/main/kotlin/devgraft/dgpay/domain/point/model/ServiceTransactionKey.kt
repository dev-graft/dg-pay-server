package devgraft.dgpay.domain.point.model

data class ServiceTransactionKey(val value: String)

/**
 * 거래 서명
 * 거래
 * 거래 이력
 * 포인트
 *
 * 보내는 사람 privateKey
 * 받는 사람 publicKey
 * 보내는 금액
 * 서비스 거래 설명
 *
 * 이러면 한쪽은 차감
 * 한쪽은 적립인데
 * 트랜잭션 아이디를 묶어야하나?
 * 그게 맞겠지 뭐
 */