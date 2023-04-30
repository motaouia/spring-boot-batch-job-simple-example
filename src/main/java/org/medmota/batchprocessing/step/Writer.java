package org.medmota.batchprocessing.step;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> { 
	
	private Logger log = LoggerFactory.getLogger(Writer.class);

	@Override
	public void write(List<? extends String> messages) throws Exception {
		for (String msg : messages) {
			log.info("Writing the data " + msg);
		}
		
	}

}
