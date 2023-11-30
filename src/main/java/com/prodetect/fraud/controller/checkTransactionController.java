package com.prodetect.fraud.controller;


import com.prodetect.fraud.entity.CheckTransactionRequest;
import com.prodetect.fraud.entity.CheckTransactionResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;

import java.util.Arrays;

@RestController
@RequestMapping("api/prodetect/")
public class checkTransactionController {

    private final static Logger logger = LoggerFactory.getLogger(checkTransactionController.class);
//
//    @PostMapping(value = "login", consumes = "text/plain", produces = "text/plain")
//    public ResponseEntity<String> createUser(@RequestBody String requests, final HttpServletRequest httpServletRequest)
//            throws Exception, MissingHeaderException, BadHeaderValuesException {
//
//        logger.info("request===" + requests);
//
//        CheckTransactionResponse checkTransactionResponse = new CheckTransactionResponse();
//        LoginRequest decryptedRequest = new LoginRequest();
//        String sourcecode = httpServletRequest.getHeader("x-source-code");
//        String ipAddress = utility.getClientIp(httpServletRequest);
//        logger.info("sourcecode===" + sourcecode);
//        decryptedRequest = encryptionService.decryptWithCredentials(requests, LoginRequest.class,
//                encryptionService.extractKeys(httpServletRequest));
//
//        logger.info("decryptedRequest========" + decryptedRequest);
//
//        if (decryptedRequest == null) {
//            checkTransactionResponse.setResponseCode("99");
//            checkTransactionResponse.setResponseMessage("An error occurred while decrypting request");
//
//            return ResponseEntity.ok(encryptionService.encrypt(checkTransactionResponse, sourcecode));
//        }
//
//        AdUserDetails userDetails = new AdUserDetails();
//
//        try {
//
//            checkTransactionResponse =
//                    authServiceInterface.authenticateUser(decryptedRequest.getUsername(),
//                            decryptedRequest.getPassword(),ipAddress);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.ok(encryptionService.encrypt(ResponseEnum.SERVICE_UNAVAILABLE, sourcecode));
//        }
//
//        return ResponseEntity.ok(encryptionService.encrypt(checkTransactionResponse, sourcecode));
//    }
//
//




    @RequestMapping(value = "/SanctionListCheck", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> pRgetSanctionListCheck(@RequestBody String request,
                                                         @RequestHeader HttpHeaders httpHeaders, final HttpServletRequest httpServletRequest) throws Exception {
        // MDC.put("requestId", utils.generateSessionId());
        String sourcecode = httpServletRequest.getHeader("x-source-code");
        CheckTransactionRequest req = new CheckTransactionRequest();
        CheckTransactionResponse resp = new CheckTransactionResponse();

        try {
            Gson gs = new Gson();
            req = gs.fromJson(request, CheckTransactionRequest.class);

            logger.info("Request: " + request);
            logger.info("Response:Response name:"+ req.getReceiverFirstName() +" "+ req.getReceiverLastName());

            resp.setResponseCode("99");
            resp.setResponseMessage("SUSPICIOUS TRANSACTION");
////            resp.setRequestId(req.getRequestId());
////            resp.setIpAddress(req.getIpAddress());
////            resp.setRequestToken(req.getRequestToken());
////            resp.setRequestType(req.getRequestType());
////            resp.setSourceChannelId(req.getSourceChannelId());
////            resp.setResponseCode("E04");
////            resp.setResponseMessage(ex.getMessage());

        } catch (Throwable ex) {
//            resp.setAffiliateCode(req.getAffiliateCode());
//            resp.setSourceCode(req.getSourceCode());
//            resp.setRequestId(req.getRequestId());
//            resp.setIpAddress(req.getIpAddress());
//            resp.setRequestToken(req.getRequestToken());
//            resp.setRequestType(req.getRequestType());
//            resp.setSourceChannelId(req.getSourceChannelId());
//            resp.setResponseCode("E04");
//            resp.setResponseMessage(ex.getMessage());
//            logger.info("Throwable caught: " + ex.getMessage());
//            logger.info("Reason: " + Arrays.toString(ex.getStackTrace()).replace(", ", "\n"));

        }
        // MDC.remove("requestId");

        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
