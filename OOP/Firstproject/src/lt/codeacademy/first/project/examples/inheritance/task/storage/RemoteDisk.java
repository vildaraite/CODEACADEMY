package lt.codeacademy.first.project.examples.inheritance.task.storage;

import java.util.ArrayList;
import java.util.List;

public class RemoteDisk implements Storage {
    private final List<Info> infos;

    public RemoteDisk() {
        infos = new ArrayList<>();
    }

    @Override
    public void saveInfo(Info info) {
        System.out.println("Issaugota i nutolusi diska");
        infos.add(info);
    }

    @Override
    public Info findInfo(int id) {
        System.out.println("Rasta  nutolusiame diske pagal id");

        //return infos.stream().filter(i -> i.getId() == id).findFirst().orElse(null);

        for(Info info: infos) {
            if(info.getId() == id) {
                return info;
            }
        }

        return null;
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Rasta nutolusiame diske pagal zodi");
        for(Info info: infos) {
            if(info.isContains(text)){
                return info;
            }
        }

        return null;
    }
}