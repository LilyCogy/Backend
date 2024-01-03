package com.ZumbaAcademy.service;

import java.util.List;

import com.ZumbaAcademy.bean.Batch;
import com.ZumbaAcademy.dao.BatchDao;

public class BatchService {

	BatchDao bd = new BatchDao();
	
	public String storeBatch(Batch batch) {
		if(bd.addBatch(batch)>0) {
			return "Successful";
		}else {
			return "Unsuccessful";
		}
	}
	
	public List<Batch> allBatchDetails() {
		return bd.getAllBatchDetails();
	}
}

