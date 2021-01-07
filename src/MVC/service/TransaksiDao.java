package MVC.service;


import MVC.model.transaksi.TransaksiModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heinz
 */
public interface TransaksiDao {
    public void insertTransaksi(TransaksiModel transaksi) throws SQLException;
    public void updateTransaksi(TransaksiModel transaksi) throws SQLException;
    public void deleteTransaksi(int id_transaksi) throws SQLException;
    public List<TransaksiModel> getAllTransaksi();
    public ResultSet getNopol();
    public ResultSet querySelectKolom(String namaKolom, String namaTable, String kondisi, String value) throws SQLException;
}
