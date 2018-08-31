package com.xyram.bots.api.Dao;

import org.springframework.stereotype.Repository;
import com.xyram.bots.api.model.PTO;

@Repository
public class PTODaoImpl extends AbstractDao implements PTODao {

	@Override
	public PTO saveOrUpdate(PTO pto) {
		getSession().saveOrUpdate(pto);
		return pto;
	}

	@Override
	public PTO updatePTO(PTO pto) {
		if (pto.getStatus()!=null && pto.getStatus().equalsIgnoreCase("allow")) {
			pto.setStatus("allow");
		} else {
			pto.setStatus("deny");
		}
		getSession().saveOrUpdate(pto);
		return pto;
	}

}