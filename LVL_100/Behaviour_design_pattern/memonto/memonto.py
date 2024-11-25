class Maze:
    def __init__(self, width, height):
        self.width = width
        self.height = height
        self.player_position = (0, 0)

    def move_player(self, direction):
        x, y = self.player_position
        if direction == 'up':
            if y > 0:
                self.player_position = (x, y - 1)
        elif direction == 'down':
            if y < self.height - 1:
                self.player_position = (x, y + 1)
        elif direction == 'left':
            if x > 0:
                self.player_position = (x - 1, y)
        elif direction == 'right':
            if x < self.width - 1:
                self.player_position = (x + 1, y)

    def create_memento(self):
        return MazeMemento(self.player_position)

    def restore_from_memento(self, memento):
        self.player_position = memento.get_player_position()

class MazeMemento:
    def __init__(self, player_position):
        self.player_position = player_position

    def get_player_position(self):
        return self.player_position

# Example usage
maze = Maze(3, 3)
maze.move_player('right')  # Player moves right
maze.move_player('down')   # Player moves down
maze.move_player('up')
# Save the current state of the maze
saved_state = maze.create_memento()

maze.move_player('left')   # Player moves left

# Restore the saved state of the maze
maze.restore_from_memento(saved_state)

print("Player position after restoring:", maze.player_position)  # Output: (1, 1)
