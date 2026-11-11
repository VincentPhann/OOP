package QuanLyCD;

public class CD {

  
    private String maCD;      // mã CD – duy nhất, dùng để định danh
    private String tuaCD;     // tựa đề CD
    private String caSy;      // tên ca sỹ
    private int    soBaiHat;   // số bài hát (ràng buộc > 0)
    private float  gia;        // đơn giá

    // ============ GETTER / SETTER ============
    public String getMaCD() { return maCD; }
    public void   setMaCD(String maCD) { this.maCD = maCD; }

    public String getTuaCD() { return tuaCD; }
    public void   setTuaCD(String tuaCD) { this.tuaCD = tuaCD; }

    public String getCaSy() { return caSy; }
    public void   setCaSy(String caSy) { this.caSy = caSy; }

    public int  getSoBaiHat() { return soBaiHat; }

    /**
     * Setter co rang buoc: so bai hat phai > 0
     * @param soBai so bai hat
     * @throws Exception neu so bai <= 0
     */
    public void setSoBaiHat(int soBai) throws Exception {
        if (soBai > 0) {
            this.soBaiHat = soBai;
        } else {
            throw new Exception("So bai hat phai lon hon 0");
        }
    }

    public float getGia() { return gia; }
    public void  setGia(float gia) { this.gia = gia; }

    // ============ CONSTRUCTOR ============

    /** Constructor rong */
    public CD() { }

    /**
     * Constructor day du
     * @param tuaCD  tua de CD
     * @param caSy   ten ca sy
     * @param soBai  so bai hat (phai > 0)
     * @param gia    don gia
     * @param maCD   ma CD
     * @throws Exception neu soBai <= 0
     */
    public CD(String tuaCD, String caSy, int soBai,
              float gia, String maCD) throws Exception {
        this.tuaCD = tuaCD;
        this.caSy  = caSy;
        this.setSoBaiHat(soBai);   // tái sử dụng ràng buộc
        this.gia   = gia;
        this.maCD  = maCD;
    }

    // ============ IN TIÊU ĐỀ BẢNG ============
    /**
     * Phuong thuc tinh: in dong tieu de cho bang danh sach CD
     * Su dung String.format de can le cot
     */
    public static void tieuDe() {
        System.out.println("In danh sach CD");

    
        for (int i = 0; i < 100; i++) System.out.print("-");
        System.out.println();

    
        String s = String.format(
            "|%10s|%10s|%10s|%10s|%10s|%10s|",
            "Ma CD", "Tua CD", "Ca Sy",
            "So Bai", "Don Gia", "Thanh Tien");
        System.out.println(s);

       
        for (int i = 0; i < 100; i++) System.out.print("-");
        System.out.println();
    }

    
    @Override
    public String toString() {
        return String.format(
            "|%10s|%10s|%10s|%10d|%10.2f|%10.2f|",
            maCD, tuaCD, caSy, soBaiHat, gia, gia * soBaiHat);
    }
}
