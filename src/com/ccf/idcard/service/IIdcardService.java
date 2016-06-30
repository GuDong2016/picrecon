package com.ccf.idcard.service;

import com.ccf.base.service.IService;
import com.ccf.idcard.domain.Idcard;

/**
 * Created by dell on 2016/6/29.
 */
public interface IIdcardService extends IService {
    public int saveIdcardInfo(Idcard idcard);
}
