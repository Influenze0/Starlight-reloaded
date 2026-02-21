# Starlight Reloaded (Fabric)

An unofficial port of [Starlight](https://github.com/PaperMC/Starlight) to Minecraft 1.21.1 Fabric.

Starlight is a mod that completely rewrites the vanilla light engine to provide
significantly improved performance.

## About this port

The original Starlight mod by [Spottedleaf](https://github.com/Spottedleaf)
was discontinued after Minecraft 1.20. **Starlight Reloaded** is an unofficial
community port that brings Starlight's optimized light engine to newer versions
of Minecraft.



## Download

- [Modrinth](https://modrinth.com/project/starlight-reloaded)
- [GitHub Releases](https://github.com/Influenze0/Starlight-reloaded/releases)

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Download the mod from the links above
3. Place the `.jar` file into the `mods` folder
4. Launch the game

## Incompatibilities

- **Phosphor** — incompatible (both mods replace the light engine)

## Performance

Starlight completely rewrites the vanilla light engine. Key benefits:

- **Faster chunk generation** — light calculations during world generation
  are significantly faster
- **Faster block updates** — light propagation when placing/breaking blocks
  is optimized
- **Stateless design** — light sections are tied directly to chunk objects,
  eliminating bugs related to missing light data

For detailed benchmarks from the original project, see
[TECHNICAL_DETAILS.md](TECHNICAL_DETAILS.md).

## Credits

- **[Spottedleaf](https://github.com/Spottedleaf)** — original author of
  Starlight
- **[1Influence](https://github.com/Influenze0)** — port to 1.21.1

## License

This project is licensed under
[LGPL-3.0-only](LICENSE), same as the original Starlight.

## Original project

- [Starlight reloaded (GitHub)](https://github.com/Influenze0/Starlight-reloaded)
- [Starlight original (GitHub)](https://github.com/PaperMC/Starlight)

