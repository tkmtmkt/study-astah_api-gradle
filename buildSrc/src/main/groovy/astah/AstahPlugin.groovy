package astah

import org.gradle.api.Plugin
import org.gradle.api.Project

class AstahPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        AstahListClassesTask astahListClassesTask =
            project.tasks.create('astahListClasses', AstahListClassesTask.class)
        astahListClassesTask.description = 'クラス一覧を表示する'

        AstahExportClassesTask astahExportClassesTask =
            project.tasks.create('astahExportClasses', AstahExportClassesTask.class)
        astahExportClassesTask.description = '指定したクラスの情報をエクスポートする'
    }
}
