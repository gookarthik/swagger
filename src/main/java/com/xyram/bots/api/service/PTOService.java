package com.xyram.bots.api.service;

import com.xyram.bots.api.model.PTO;

public interface PTOService {
	
	PTO saveOrUpdate(PTO pto);

	PTO updatePTO(PTO pto);
}
