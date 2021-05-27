class PlantParent < ActiveRecord::Migration[5.2]
  def change
    create_table plant_parent |plantParent| 
      plant_parent.string name
    end
  end
end
