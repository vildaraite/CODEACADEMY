package lt.codeacademy.first.project.examples.inheritance.task.storage;

import java.util.HashMap;
import java.util.Map;

public class Database implements Storage {

    private final Map<Integer, Info> infos;

    public Database() {
        infos = new HashMap<>();
    }

    @Override
    public void saveInfo(Info info) {
        infos.put(info.getId(), info);
        System.out.println("Saugoti duomenu bazeje");
    }

    @Override
    public Info findInfo(int id) {
        System.out.println("Rasti info pagal id");
        return infos.get(id);
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Rasta duomenu bazeje pagal zodi");
		/*for(Map.Entry<Integer, Info> entry: infos.entrySet()) {
			Info info = entry.getValue();
			if(info.isContains(text)) {
				return info;
			}
		}*/

        for(Info info: infos.values()) {
            if(info.isContains(text)) {
                return info;
            }
        }

        //return infos.values().stream().filter(i -> i.isContains(text)).findFirst().orElse(null);

        return null;
    }
}