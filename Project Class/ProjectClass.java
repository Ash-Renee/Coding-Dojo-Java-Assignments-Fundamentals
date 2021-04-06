public class ProjectClass{
        private String name;
        private String description;
        private String projectName;
        // this is what sets the strings to their access modifer (private)
        // as well as what type of data it is, plus the label of the data

        public ProjectClass(){
        }


        public ProjectClass(String name){
            this.name = name;
        }

        public ProjectClass(String name, String description){
            this.name = name;
            this.description = description;
        }

        //these are my overload statements, which if I understand correctly is just adding in various ways to get/use data,
        //so that we don't have to re-write ccode and create more work for ourselves

        public String getProjectClassName(){
            return this.name;
        }

        public void setProjectClassName(String name){
            this.name = name;
        }

        public String getProjectClassDescription(){
            return this.description;
        }

        public void setProjectClassDescription(String description){
            this.description = description;
        }
        //get  and set statements for the set statements on the right side


        public String elevatorPitch(){
            return "Hello " + name + " this is the pitch for my new idea: " + description + ".  What did you think?";
        }
        //This is the output that the user recieves


}



