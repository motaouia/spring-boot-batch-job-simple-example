package org.medmota.batchprocessing.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class JobCompletionListener extends JobExecutionListenerSupport {
	
	private static final Logger log = LoggerFactory.getLogger(JobCompletionListener.class);
	
	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! BATCH JOB COMPLETED SUCCESSFULLY !!!");
		}
	}

}
