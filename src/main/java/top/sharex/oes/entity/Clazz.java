package top.sharex.oes.entity;

public class Clazz {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.des
     *
     * @mbggenerated
     */
    private String des;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.teacher_id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    public Clazz(Integer id, String name, String des, Integer teacherId) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
     *
     * @mbggenerated
     */
    public Clazz() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.id
     *
     * @return the value of clazz.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.id
     *
     * @param id the value for clazz.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.name
     *
     * @return the value of clazz.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.name
     *
     * @param name the value for clazz.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.des
     *
     * @return the value of clazz.des
     *
     * @mbggenerated
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.des
     *
     * @param des the value for clazz.des
     *
     * @mbggenerated
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.teacher_id
     *
     * @return the value of clazz.teacher_id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.teacher_id
     *
     * @param teacherId the value for clazz.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}