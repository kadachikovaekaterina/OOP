package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;

import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.model.RepositoryFileAnother;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("OOPDZ5_1_2/users.txt");
        FileOperation fileOperationNew = new FileOperationImpl("OOPDZ5_1_2/usersNew.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryAnother = new RepositoryFileAnother(fileOperationNew);
        UserController controller = new UserController(repository);
        UserController controllerAnother = new UserController(repositoryAnother);
        ViewUser view = new ViewUser(controllerAnother);
        view.run();
    }
}
