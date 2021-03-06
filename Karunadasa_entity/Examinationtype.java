
@Entity
public class ExaminationType {
    // may enum

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examinationtypeId", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Examination> examinationList;

}
