package com.xyram.bots.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xyram.bots.api.model.PTO;
import com.xyram.bots.api.service.PTOService;

@Controller
@RequestMapping(value="/pto")
public class PTOController {
	
	@Autowired
	private  PTOService ptoService;

	@RequestMapping(value = "/create/", method = RequestMethod.POST)
	@ResponseBody
	public  PTO savePTO(@RequestBody  PTO pto) {
		return ptoService.saveOrUpdate(pto);
	} 
	
	@RequestMapping(value = "/update/", method = RequestMethod.PUT)
	@ResponseBody
	public  PTO updatePTO(@RequestBody  PTO pto) {
		return ptoService.updatePTO(pto);
	} 
	
	
}