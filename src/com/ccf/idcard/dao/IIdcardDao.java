package com.ccf.idcard.dao;

import com.ccf.base.dao.IDao;
import com.ccf.idcard.domain.Idcard;
import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2016/6/29.
 */
@Repository("idcardDao")
public interface IIdcardDao extends IDao {
    public int saveIdcardInfo(Idcard idcard);
}
