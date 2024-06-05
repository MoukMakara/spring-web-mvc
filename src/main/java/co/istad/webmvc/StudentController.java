package co.istad.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/{studentId}")
    String viewStudent(@PathVariable Integer studentId,
                       @RequestParam(required = false, defaultValue = "Spring FrameWork") String subject,
                        @ModelAttribute Student student,
                       Model model
    ) {
//        Student student = new Student();
        student.setId(studentId);
        student.setName("Mouk Makara");
        student.setSubject(subject);
        model.addAttribute("student", student); // add object
        return "student";
    }
}