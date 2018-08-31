package com.xyram.bots.api.Dao;

import com.xyram.bots.api.model.PTO;

public interface PTODao {
	
	PTO saveOrUpdate(PTO pto);

	PTO updatePTO(PTO pto);

}
