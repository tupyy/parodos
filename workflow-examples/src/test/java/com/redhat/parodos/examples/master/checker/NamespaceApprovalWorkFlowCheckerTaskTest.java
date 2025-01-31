package com.redhat.parodos.examples.master.checker;

import com.redhat.parodos.examples.base.BaseWorkFlowCheckerTaskTest;
import com.redhat.parodos.workflow.task.checker.BaseWorkFlowCheckerTask;
import com.redhat.parodos.workflow.task.enums.WorkFlowTaskOutput;
import com.redhat.parodos.workflow.task.parameter.WorkFlowTaskParameter;
import com.redhat.parodos.workflows.work.WorkContext;
import com.redhat.parodos.workflows.work.WorkReport;
import com.redhat.parodos.workflows.work.WorkStatus;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Namespace Approval WorkFlow Checker Task execution test
 *
 * @author Gloria Ciavarrini (Github: gciavarrini)
 * @author Richard Wang(Github: richardw98)
 */
public class NamespaceApprovalWorkFlowCheckerTaskTest extends BaseWorkFlowCheckerTaskTest {

	NamespaceApprovalWorkFlowCheckerTask namespaceApprovalWorkFlowCheckerTask;

	@Before
	public void setUp() {
		namespaceApprovalWorkFlowCheckerTask = Mockito
				.spy((NamespaceApprovalWorkFlowCheckerTask) getConcretePersonImplementation());
	}

	@Override
	protected BaseWorkFlowCheckerTask getConcretePersonImplementation() {
		return new NamespaceApprovalWorkFlowCheckerTask();
	}

	@Test
	public void checkWorkFlowStatus() {
		// given
		WorkContext workContext = Mockito.mock(WorkContext.class);

		// when
		WorkReport workReport = namespaceApprovalWorkFlowCheckerTask.checkWorkFlowStatus(workContext);
		assertNotNull(workReport);
		assertEquals(WorkStatus.COMPLETED, workReport.getStatus());
		assertNull(workReport.getError());
	}

	@Test
	public void getWorkFlowTaskParameters() {
		// when
		List<WorkFlowTaskParameter> workFlowTaskParameters = namespaceApprovalWorkFlowCheckerTask
				.getWorkFlowTaskParameters();

		// then
		assertNotNull(workFlowTaskParameters);
		assertEquals(0, workFlowTaskParameters.size());
	}

	@Test
	public void getWorkFlowTaskOutputs() {
		// when
		List<WorkFlowTaskOutput> workFlowTaskOutputs = namespaceApprovalWorkFlowCheckerTask.getWorkFlowTaskOutputs();

		// then
		assertNotNull(workFlowTaskOutputs);
		assertEquals(0, workFlowTaskOutputs.size());
	}

}