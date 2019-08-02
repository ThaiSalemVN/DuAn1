/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom8.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nhom8.helper.JdbcHelper;
import nhom8.model.HoaDon;

/**
 *
 * @author Asus
 */
public class HoaDonDao {

    public String maxMaHD(){
        String mHD="";        
        try {
            String sql ="select MAX(maHD) from HoaDon";
            ResultSet rs  = JdbcHelper.executeQuery(sql);            
            while (rs.next()) {                
                 mHD=rs.getString(1);
            }          
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mHD;
    }
    
    public List<HoaDon> selectHoaDon(){
        String sql = "Select * from HoaDon";
        List<HoaDon> list = getListHoaDon(sql);
        return  list;
    }
     
    public  HoaDon selectHoaDonByID(String mhd){
         String sql = "Select * from HoaDon where MaHD=?";
         List<HoaDon> list = getListHoaDon(sql, mhd);
         return list.size()>0? list.get(0): null;
    }
    public List<HoaDon> getListHoaDon(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {                    
                    HoaDon hoaDon = readHoaDonModel(rs);
                    list.add(hoaDon);
                }
            } finally {
              rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    private HoaDon readHoaDonModel(ResultSet rs) throws SQLException {
        HoaDon hoaDon = new HoaDon(rs.getString("MaHD"),
                rs.getString("MaNV"),
                rs.getString("MaKH"),
                rs.getDate("NgayBan"));
        return hoaDon;
    }
    
//   public static void main(String[] args) {
//        new HoaDonDao().maxMaHD();
//    }
}
