package com.redhat.masvida.dao;

import java.math.BigDecimal;

import com.redhat.masvida.vo.RcmVO;


public interface RcmDAOLocal {
	public RcmVO buscarRcm(BigDecimal i);
}