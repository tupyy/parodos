/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.redhat.parodos.sdk.api;

import com.redhat.parodos.sdk.api.ApiException;
import com.redhat.parodos.sdk.model.WorkFlowCheckerTaskRequestDTO;
import com.redhat.parodos.sdk.model.WorkFlowRequestDTO;
import com.redhat.parodos.sdk.model.WorkFlowResponseDTO;
import com.redhat.parodos.sdk.model.WorkFlowStatusResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowApi
 */
@Ignore
public class WorkflowApiTest {

    private final WorkflowApi api = new WorkflowApi();

    
    /**
     * Executes a workflow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        WorkFlowRequestDTO workFlowRequestDTO = null;
                WorkFlowResponseDTO response = api.execute(workFlowRequestDTO);
        // TODO: test validations
    }
    
    /**
     * Returns a workflow status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String workFlowExecutionId = null;
                WorkFlowStatusResponseDTO response = api.getStatus(workFlowExecutionId);
        // TODO: test validations
    }
    
    /**
     * Updates a workflow checker task status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkFlowCheckerTaskStatusTest() throws ApiException {
        String workFlowExecutionId = null;
        String workFlowCheckerTaskName = null;
        WorkFlowCheckerTaskRequestDTO workFlowCheckerTaskRequestDTO = null;
                String response = api.updateWorkFlowCheckerTaskStatus(workFlowExecutionId, workFlowCheckerTaskName, workFlowCheckerTaskRequestDTO);
        // TODO: test validations
    }
    
}
