package khj.ruslan.InfinityBoardJavaFinal.data;

import khj.ruslan.InfinityBoardJavaFinal.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
