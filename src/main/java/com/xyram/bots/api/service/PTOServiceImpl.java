package com.xyram.bots.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.xyram.bots.api.Dao.PTODao;
import com.xyram.bots.api.model.PTO;

@Service
@Transactional
public class PTOServiceImpl implements PTOService {
	
	@Autowired
	private PTODao ptoDao;

	@Override
	public PTO saveOrUpdate(PTO pto) {
		return ptoDao.saveOrUpdate(pto);
	}

	@Override
	public PTO updatePTO(PTO pto) {
		return ptoDao.updatePTO(pto);
	}
	
	
}
