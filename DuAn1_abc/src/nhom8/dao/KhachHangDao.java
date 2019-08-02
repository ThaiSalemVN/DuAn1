
package nhom8.dao;

import nhom8.helper.JdbcHelper;
import nhom8.model.KhachHang;


public class KhachHangDao {
    
    public void insert(KhachHang kh){
        String sql ="insert into KhachHang values(?,?,?,?,?)";
        JdbcHelper.excuteUpdate(sql, kh.getMaKH(),
                    kh.getTenKH(),
                    kh.isGioiTinh(),
                    kh.getDiaChi(),
                    kh.getSoDT());
    }
}
