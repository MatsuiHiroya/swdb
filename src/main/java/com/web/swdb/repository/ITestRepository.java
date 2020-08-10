package com.web.swdb.repository;

public interface ITestRepository  {
    /**
     * ユーザー名とパスワードをUserテーブルに記録する
     *
     * @param userName ユーザー名
     * @param userPass パスワード
     * @return データベースの更新行数
     */
    public int insert(String userName, String userPass);

}
