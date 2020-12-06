package web.mvc.test.business.custom.impl;

import web.mvc.test.business.custom.SubjectBO;
import web.mvc.test.entity.Subject;
import web.mvc.test.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Component
@Transactional
public class SubjectBOImpl implements SubjectBO {

    @Autowired
    private SubjectRepository subjectRepository;

}
