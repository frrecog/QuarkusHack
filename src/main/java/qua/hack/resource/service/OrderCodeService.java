package qua.hack.resource.service;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import qua.hack.resource.entity.OrderCode;
import qua.hack.resource.repository.OrderCodeRepository;
import qua.hack.resource.ro.OrderCodeResponse;

@ApplicationScoped
public class OrderCodeService {
	
	@Inject
	private OrderCodeRepository orderCodeRepository;
	
	private static final int CODE_LENGTH = 10;

	public OrderCodeResponse getOrderSecretCode(String id) throws Exception {
		validateSecretId(id);
		String[] splitCode = id.split("_");
		Optional<OrderCode> orderCodes = orderCodeRepository.findById(Long.parseLong(splitCode[0]));
		if (orderCodes.isEmpty()) {
			return new OrderCodeResponse();
		}
		return createResponse(orderCodes.get());
		
	}

	private OrderCodeResponse createResponse(OrderCode orderCode) {
		OrderCodeResponse response = new OrderCodeResponse();
		response.setOrderId(orderCode.getOrderId());
		response.setAgentId(orderCode.getAgentId());
		response.setOrderTime(orderCode.getOrderTime());
		orderCode.getItems().forEach(oc -> {
			response.getItems().put(oc.getItemCode(), oc.getSecretOperationCode());
		});
		return response;
	}

	private void validateSecretId(String id) throws Exception {
		if (id.length() != CODE_LENGTH) {
			throw new Exception("Incorrect code");
		}
	}

}
