package sb.restTask;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Finder {
    public static Set<String> findOldMembers(List<MembersGroup> groups) {
        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > 50) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }
    public static List<Member> findYoungMembers(List<MembersGroup> groups, Integer rightAgeBound) {
        return groups.stream()
                .flatMap(x -> x.getMembers().stream())
                .filter(x -> x.getAge() <= rightAgeBound)
                .collect(Collectors.toList());
    }
}
