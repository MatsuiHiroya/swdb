package com.web.swdb.service;

import com.web.swdb.repository.ITestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * この実装クラスは、Repository をIoC/DIして、データベースを使いながら、
 * ユーザに関わる機能（サービス）を提供する？
 */

@Service
public class TestService implements ITestService{
    @Autowired
    private ITestRepository testRepos;

    /**
     * @Autowiread がついたコンストラクタは、 authUserRepos をIoC/DIする。
     * この実装クラスはたいした働きをしていないように思えるが、データベースにアクセスするRepository と、
     * データベースのアクセスを使って何かの機能を提供するService として、別々の役割を割り当てている。。
     */

    @Override
    public void registerUser(String userName, String userPass) {
        int n = testRepos.insert(userName, userPass);
        System.out.println("記録行数：" + n);
    }
}
