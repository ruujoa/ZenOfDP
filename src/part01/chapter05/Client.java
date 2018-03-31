package part01.chapter05;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		List<Girl> listGirls = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			listGirls.add(new Girl());
		}
		teacher.command(new GroupLeader(listGirls));
		
		InstallSoftware invoker = new InstallSoftware();
		invoker.installWizard(new Wizard());
	}
}
