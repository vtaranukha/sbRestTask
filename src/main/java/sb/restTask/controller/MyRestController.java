package sb.restTask.controller;

import sb.restTask.Finder;
import sb.restTask.Member;
import sb.restTask.MembersGroup;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("members")
public class MyRestController {
    private List<MembersGroup> groups = Arrays.asList(
        new MembersGroup("Group1",Arrays.asList(
            new Member("John", 21),
            new Member("Peter", 22)
        )),
        new MembersGroup("Group2", Arrays.asList(
            new Member("Sam", 23),
            new Member("Kate", 24),
            new Member("Ross", 25)
        ))
    );

    @GetMapping
    public List<MembersGroup> list(){
        return groups;
    }

    @GetMapping("{rightAgeBound}")
    public List<Member> getYoungMembers(@PathVariable Integer rightAgeBound) {
        return Finder.findYoungMembers(groups, rightAgeBound);
    }
}
