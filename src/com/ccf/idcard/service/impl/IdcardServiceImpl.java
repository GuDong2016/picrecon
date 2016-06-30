package com.ccf.idcard.service.impl;

import com.ccf.idcard.dao.IIdcardDao;
import com.ccf.idcard.domain.Idcard;
import com.ccf.idcard.service.IIdcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2016/6/29.
 */
@Service("idcardService")
public class IdcardServiceImpl implements IIdcardService{
    @Autowired
    IIdcardDao idcardDao;
    @Override
    public int saveIdcardInfo(Idcard idcard) {
        return this.idcardDao.saveIdcardInfo(idcard);
    }
}
