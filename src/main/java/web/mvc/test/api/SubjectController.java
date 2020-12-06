package web.mvc.test.api;

import web.mvc.test.business.custom.SubjectBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {

}
