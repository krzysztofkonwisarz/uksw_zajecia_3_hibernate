package pl.edu.uksw.j2eecourse.zajecia_3;

import javax.persistence.*;

/**
 * Możemy też zaimportować org.hibernate.annotations.Entity, ale jest Deprecated. Zaleca się używanie javax.persistence.*
 */
@Entity
public class Drzewo {

    @Id
    @GeneratedValue
    private Long id;

}
