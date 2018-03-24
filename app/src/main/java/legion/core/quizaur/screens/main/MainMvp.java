package legion.core.quizaur.screens.main;

import legion.core.quizaur.base.BaseMvp;

public interface MainMvp {

    interface View extends BaseMvp.View {
    }

    interface Presenter extends BaseMvp.Presenter {
    }

    interface FragmentNavigation {
        void showMenuFragment();
        void showQuizListFragment();
    }
}
