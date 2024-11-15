public class sach {
    private String id;
    private String tensach;
    private String tentacgia;
    private String tennhaxuatban;
    public sach( String id,String tensach,String tentacgia,String tennhaxuatban){
        this.id=id;
        this.tensach=tensach;
        this.tentacgia=tentacgia;
        this.tennhaxuatban=tennhaxuatban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }
    @Override
    public String toString(){
        return "Mã sách "+id+"tên sách, "+tensach+"tên tác giả, "+tentacgia+"tên nhà xuất bản, "+tennhaxuatban;
    }

}
